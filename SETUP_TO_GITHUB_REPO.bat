@echo off
setlocal EnableExtensions
title LoanPayBima GitHub Setup

echo.
echo ================================================
echo   LoanPayBima - GitHub Repository Setup
echo ================================================
echo.
echo Ye tool project ko GitHub Desktop repository me
echo sahi folder structure ke saath copy karega.
echo.

set "REPO=%USERPROFILE%\Documents\GitHub\LoanPayBima-Android"

if not exist "%REPO%\.git" (
    set "REPO=%USERPROFILE%\OneDrive\Documents\GitHub\LoanPayBima-Android"
)

if not exist "%REPO%\.git" (
    echo Repository automatic nahi mili.
    echo.
    echo GitHub Desktop me Repository ^> Show in Explorer kholo.
    echo Upar address bar se poora folder path copy karo.
    echo Example:
    echo C:\Users\Admin\Documents\GitHub\LoanPayBima-Android
    echo.
    set /p "REPO=Yahan repository ka path paste karke ENTER dabaye: "
)

if not exist "%REPO%\.git" (
    echo.
    echo ERROR: Is folder me .git nahi mila:
    echo %REPO%
    echo.
    echo GitHub Desktop se exact repository folder choose karein.
    pause
    exit /b 1
)

echo.
echo Repository mil gayi:
echo %REPO%
echo.
echo Purane project files clean kiye ja rahe hain...
echo Hidden .git folder safe rahega.
echo.

for /d %%D in ("%REPO%\*") do (
    if /I not "%%~nxD"==".git" rmdir /s /q "%%D"
)
for %%F in ("%REPO%\*") do del /q "%%F" 2>nul

echo Naya LoanPayBima project copy ho raha hai...
robocopy "%~dp0" "%REPO%" /E /XD ".git" /XF "SETUP_TO_GITHUB_REPO.bat" >nul

echo.
echo ================================================
echo SUCCESS
echo ================================================
echo.
echo Ab GitHub Desktop kholo.
echo Left side Changes dikhengi.
echo Summary me likho:
echo Add LoanPayBima final Android app
echo.
echo Fir:
echo 1. Commit to main
echo 2. Push origin
echo 3. GitHub website ^> Actions
echo 4. Build LoanPayBima Android
echo.
pause
