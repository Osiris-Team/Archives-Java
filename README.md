# Archives-Java [![](https://jitpack.io/v/Osiris-Team/Archives-Java.svg)](https://jitpack.io/#Osiris-Team/Archives-Java)
High level Java API for handling archives (.tar, .tar.gz and .tar.xz).

```java
Tar tar = new Tar("file-name");
TarGz targz = new TarGz("file-name");
TarXz tarxz = new TarXz("file-name");

tar.addFile(fileOrDir); // Works the same for TarGz and TarXz.
tar.createInDir(dir); // Creates file-name.tar in the specified directory.
```
Note that this is still in early development so the example might have changed and some things are not working yet.

## Motivation
I wasn't able to find a Java lib/api that was simple and easy to use and covered multiple archive types in a single lib.
Thus I started this project with the aim of having a high level, simple Java lib to handle archive files.

