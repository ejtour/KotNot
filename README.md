分享到github 后出现AS无法提交
  ```
  remote: Support for password authentication was removed on August 13, 2021.
  remote: Please see https://docs.github.com/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.

  ```

使用 ```git remote set-url origin SSH时项目地址 ``` 命令修改!

使用介绍

step1: 在settings.gradle.kts 中添加引用 (旧版本studio 在 在root build.gradle 中)
```
 dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven("https://jitpack.io")
			// maven { url 'https://jitpack.io' } 旧版本引用方式
		}
	}
```
step2: 在app.gradle.kts 中 添加引用 

```
dependencies {
	        implementation 'com.github.ejtour:KotNot:1.0.3'
	}

```



