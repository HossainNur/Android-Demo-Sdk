# Android-Demo-Sdk

A simple Android library that demonstrates how to build and publish an Android SDK (.aar) using JitPack.

## ✨ Features

- Easy integration
- Lightweight
- Demonstrates how to publish to JitPack

## 🛠️ Installation

Add the JitPack repository to your project-level `build.gradle`:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

Then add the dependency to your module-level build.gradle:
dependencies {
    implementation 'com.github.HossainNur:Android-Demo-Sdk:1.0'
}
🚀 Usage
import com.hossainnur.library.MyLibraryUtils;

String message = MyLibraryUtils.greet("John");
Log.d("LibraryOutput", message); // Output: Hello, John!


🧪 Example Output
Hello, John!
