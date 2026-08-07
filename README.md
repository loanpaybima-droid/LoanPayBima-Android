# LoanPayBima Android App v1

Included:
- Splash screen
- Customer / Partner / Admin role selection
- Customer Mobile/Email + Password login UI
- Customer dashboard
- Insurance on EMI, Car, Bike, Commercial Vehicle links
- WhatsApp support
- Partner login via existing LoanPayBima website
- Admin login via WordPress admin
- GitHub Actions workflow to build APK without Android Studio

Important:
Customer login is UI-only in this v1. Real authentication requires a secure WordPress REST/JWT (or equivalent) API. Do not hard-code WordPress admin credentials inside the app.

Build without Android Studio:
Upload the project to GitHub, open Actions, run "Build Android APK", then download the generated artifact.
