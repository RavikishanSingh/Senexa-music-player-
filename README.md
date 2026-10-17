# Senexa 🎧
### Modern, Lightweight, Ad-Free & Account-Free Android Music Player

Senexa is a feature-rich, high-performance Android music streaming and playback application built with Kotlin. It provides an immersive, Spotify-inspired audio streaming experience combined with local music discovery, real-time synchronized lyrics, and robust background media control—completely **free of commercial advertisements and mandatory user accounts**.

---

## ✨ Key Features

- **Ad-Free Music Streaming**: Enjoy uninterrupted audio playback without annoying audio or banner advertisements.
- **Zero Registration Barrier (Account-Free)**: Instant access to music discovery, search, and streaming without forcing sign-up procedures or personal data collection.
- **Robust Background Playback**: Powered by `MusicService` running as a **Foreground Service** using **AndroidX Media3 (ExoPlayer)** to prevent OS process termination during multitasking.
- **Real-Time Synchronized Lyrics**: Integrated `:lrclib` module fetches and renders time-stamped `.lrc` lyrics in sync with audio playback.
- **Decentralized Music Search**: Real-time discovery and search across extensive catalogs of tracks, albums, artists, and curated playlists.
- **App Widgets & Notifications**: System-level media notifications and home screen app widgets (`WidgetPlayerProvider`) for instant lock-screen and home screen playback control.
- **Privacy-Centric Architecture**: Local caching (`SharedPreferenceManager`) ensuring user preferences and playlists remain private on the device.

---

## 🏗️ Project Architecture & Structure

Senexa is structured into a clean, modular Gradle architecture:

```
Senexa/
├── app/                  # Main Android Application module
│   ├── src/main/java/com/ravis/senexa/
│   │   ├── activities/   # UI Activities (MainActivity, SearchActivity, ArtistProfileActivity, etc.)
│   │   ├── adapters/     # RecyclerView adapters for songs, albums, artists, and playlists
│   │   ├── model/        # Data models and record classes
│   │   ├── network/      # ApiManager, RequestNetwork, and NetworkChangeReceiver
│   │   ├── records/      # JSON response data classes (Gson mapped)
│   │   ├── services/     # MusicService & media notification receivers
│   │   ├── utils/        # MusicPlayerManager, SharedPreferences, and custom views
│   │   └── widgets/      # App widget providers and control receivers
│   └── src/main/res/     # Layouts, drawables, values, and themes
└── lrclib/               # Specialized module for fetching synchronized lyrics
```

---

## 🛠️ Tech Stack & Libraries

- **Programming Language**: Kotlin & Java
- **Audio Engine**: AndroidX Media3 (ExoPlayer)
- **Networking**: Custom `RequestNetwork` wrapper & Gson JSON serialization
- **Image Caching**: Picasso for efficient album artwork loading
- **UI Components**: Material Design 3, RecyclerView, ConstraintLayout, and ViewBinding
- **Architecture Pattern**: Controller-Service hybrid architecture with lifecycle-aware management

---

## 🚀 Getting Started & Installation

### Prerequisites
* **Android Studio** (Koala / Jellyfish or latest stable version recommended)
* **Java Development Kit (JDK) 17+**
* **Kotlin 2.0+**
* **Android SDK** (API Level 24 to 34+)
* An Android physical device or emulator (API 24+)

### Steps to Run
1. Clone or download the repository to your local machine.
2. Open Android Studio and select **Open**, navigating to the `Senexa` root folder.
3. Allow Gradle to sync dependencies and build the project.
4. Ensure your `local.properties` file points to your Android SDK directory (e.g., `sdk.dir=C\\:\\\\Users\\\\...\\\\AppData\\\\Local\\\\Android\\\\Sdk`).
5. Connect an Android device or start an emulator.
6. Click the **Run 'app'** button in Android Studio to compile and deploy Senexa.

---

## 🤝 Contributing
Contributions, bug fixes, and feature suggestions are welcome! Feel free to open an issue or submit a pull request.

---

## 📄 License
This project is open-source and available under the MIT License.
