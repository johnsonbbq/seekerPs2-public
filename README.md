# SeekerPS2

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0.en.html)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/)
[![Architecture](https://img.shields.io/badge/Architecture-ARM64-orange.svg)](https://developer.arm.com/)
[![GitHub](https://img.shields.io/badge/GitHub-johnsonbbq%2FseekerPs2-public-black.svg)](https://github.com/johnsonbbq/seekerPs2-public)

SeekerPS2 is an Android PlayStation 2 emulator project for ARM64 devices. This public repository contains a sanitized open-source copy of the project source, suitable for inspection, contribution, and self-build workflows.

## Demo Video

Watch the project preview on YouTube: [https://youtu.be/5J6zQU1auJk?si=tXdV5XKs9sV5h_5w](https://youtu.be/5J6zQU1auJk?si=tXdV5XKs9sV5h_5w)

## Introduction

SeekerPS2 is focused on bringing PS2 emulation to modern Android hardware with a mobile-oriented interface, touch controls, external controller support, save states, and per-game configuration.

This repository is intended for open-source collaboration. Sensitive local files, signing material, private configuration, build outputs, and other nonessential artifacts have been removed from this public copy.

## Features

- PS2 emulation on Android ARM64 devices
- Touch controls and external gamepad support
- Save states and memory card management
- Cover art display and game library browsing
- Per-game settings and renderer selection
- Release and debug build support from source

## Requirements

- Android 8.0 (API 26) or higher
- ARM64 device
- Android Studio
- Android NDK `28.2.13676358`
- Java 17

## Build From Source

```bash
git clone https://github.com/johnsonbbq/seekerPs2-public.git
cd seekerPs2-public
./gradlew assembleRelease
```

The generated APK will be placed under `app/build/outputs/apk/`.

## Setup Notes

SeekerPS2 does not include PlayStation 2 BIOS files, game ROMs, or disc images.

Users must provide:
- Their own legally obtained PS2 BIOS files
- Their own legally obtained game backups

Supported game container formats include `ISO`, `CHD`, `CSO`, `ZSO`, `BIN/CUE`, and several related disc image formats.

## License

This project is released under the [GNU General Public License v3.0](LICENSE).

That means, in general:
- You may use, study, modify, and redistribute the code
- Derivative distributions must remain under GPL-compatible terms where required
- Source availability obligations apply when you distribute modified versions

Please read the full GPL text before redistributing builds or forks.

## Copyright

Copyright © 2026 SeekerPS2 Developers.

Additional upstream and third-party components remain the property of their respective authors and rightsholders.

PlayStation and PlayStation 2 are trademarks of Sony Interactive Entertainment. This project is not affiliated with, endorsed by, or sponsored by Sony Interactive Entertainment.

## Privacy

The public source tree is intended to run locally on the user device and does not ship with account login, advertising SDKs, or telemetry/analytics code added by this project.

Important privacy notes:
- The app may access local storage that the user selects for BIOS files, save data, screenshots, and game directories
- Optional network features, if enabled by the user, communicate directly with their configured endpoints or bundled external sources
- This repository does not include any backend service that collects personal profiles or account data from users

For the project privacy statement used by the app/docs, see [docs/privacy-policy.md](docs/privacy-policy.md).

## Legal Notice

- No PlayStation 2 BIOS files are included
- No commercial game content is included
- Users are responsible for complying with copyright law in their jurisdiction
- This repository is provided for software development, research, preservation, and interoperability discussion

## Contributing

Pull requests and issue reports are welcome.

Please use the issue tracker for:
- Build failures
- Device compatibility reports
- Performance regressions
- UI or input bugs
- Documentation fixes

Project issues: [github.com/johnsonbbq/seekerPs2-public/issues](https://github.com/johnsonbbq/seekerPs2-public/issues)

## Repository Notes

This GitHub repository is a public-safe copy of the development project. The following categories of files were intentionally removed before publication:

- Release signing keys and signing properties
- Local machine configuration files
- Build outputs and Gradle caches
- Private contact details
- Other unnecessary artifacts that only increase repository size
