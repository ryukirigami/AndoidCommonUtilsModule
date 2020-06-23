# AndoidCommonUtilsModule

1. Config Project with JitPack<br>
	a. Open your gradle (Library) and apply plugin of JitPack<br>
		apply plugin: 'com.android.library'<br>
		apply plugin: 'com.github.dcendents.android-maven'<br>
		group='com.ryukirigami'<br>
		version='0.0.1'<br>
		...

	b. Add classpath in gradle (Project)<br>
		dependencies {<br>
			classpath 'com.android.tools.build:gradle:3.6.2'<br>
			classpath 'com.github.dcendents.android-maven-gradle-plugin:2.0'

2. Publish Project to Github<br>
	a. Share your project on github and make it public<br>
	b. Commit and push the code<br>
	c. Create release tags for your project

3. Get Download Information from JitPack
