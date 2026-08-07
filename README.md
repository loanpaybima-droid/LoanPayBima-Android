# LoanPayBima Android FINAL

Native Android/Kotlin foundation for LoanPayBima.

## Included now
- Splash and LoanPayBima branding
- Customer / Partner / Admin selection
- Customer Mobile/Email + Password UI
- Customer registration route
- Customer services dashboard
- Insurance on EMI
- Car, Bike, Commercial Vehicle, Health and Term Insurance
- Razorpay customer service payment page
- WhatsApp support: +91 93252 80889
- Partner login via existing LoanPayBima website
- Admin login via WordPress
- In-app WebView with document/file upload support
- GitHub Actions: installable debug APK + unsigned release AAB
- Windows one-click GitHub repository setup script

## Important backend limitation
Real customer credential verification is intentionally not implemented without a secure first-party WordPress authentication API. The app does not hard-code or store WordPress credentials.

## Play Store
The GitHub workflow creates an unsigned release AAB. A signed AAB using a private upload key must be configured before Play Console upload.
