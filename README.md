# LoanPayBima Android — Production Foundation

Native Android/Kotlin foundation for LoanPayBima.

## Current included functionality
- LoanPayBima branding and splash screen
- Customer / Partner / Admin role selection
- Customer Mobile/Email + Password UI
- Customer service dashboard
- Insurance on EMI, Car, Bike, Commercial Vehicle, Health and Term Insurance links
- Personal Loan, Credit Card and Online Bank Account links
- Existing LoanPayBima website integration through in-app WebView
- Partner login route to existing website
- Admin route to WordPress admin
- WhatsApp support: +91 93252 80889
- GitHub Actions workflow that builds:
  - installable DEBUG APK
  - unsigned RELEASE AAB

## Security note
The Customer login UI deliberately does NOT send or store the typed password yet.
A secure first-party WordPress REST/JWT (or equivalent) authentication API is required before real Mobile/Email + Password login can be enabled.

Do not hard-code WordPress passwords, Razorpay secrets, API secrets, or signing keys inside the Android source.

## Razorpay
Razorpay is NOT hard-coded into this foundation yet.
For production, use a backend endpoint to create orders and verify payment signatures server-side.

## Play Store AAB signing
The included GitHub workflow creates an unsigned release AAB.
Before Play Store upload, configure an upload keystore using GitHub encrypted secrets, then build a signed AAB.

## Upload to GitHub using GitHub Desktop
1. Extract this ZIP somewhere OUTSIDE the cloned repository.
2. Open GitHub Desktop and select `LoanPayBima-Android`.
3. Repository > Show in Explorer.
4. Delete the old ZIP/demo files from that repository folder, but keep the hidden `.git` folder.
5. Copy the CONTENTS of this project folder into the repository root.
6. GitHub Desktop will show changes.
7. Summary: `Add LoanPayBima production foundation`
8. Commit to main.
9. Push origin.
10. On GitHub website, open Actions > Build LoanPayBima Android > Run workflow.
11. After build completes, open the workflow run and download the APK artifact.

## Expected repository root
.github/
app/
build.gradle.kts
gradle.properties
settings.gradle.kts
README.md
