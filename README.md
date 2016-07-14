# ButterKnifeDemo

ButterKnife 8.0.1版本的使用说明


### 1. ButterKnife 8.0.1版本在AndroidStudio中的配置

* 可以参考简书上`码农仔`的介绍，[原文地址](http://www.jianshu.com/p/bf9018c1a7f6)


a .Project的build.gradle文件中增加classpath


	buildscript {
	    repositories {
	        jcenter()
	    }
	    dependencies {
	        classpath 'com.android.tools.build:gradle:2.1.0'
	        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
	    }
	}
	allprojects {
	    repositories {
	        jcenter()
	    }
	}
	task clean(type: Delete) {
	    delete rootProject.buildDir
	}

b. 在Module的build.gradle文件中增加plugin

	apply plugin: 'com.neenbedankt.android-apt'


c. 在Dependencies中增加下面两句

	compile 'com.jakewharton:butterknife:8.0.1'
	apt 'com.jakewharton:butterknife-compiler:8.0.1'


### 2. ButterKnife 8.0.1版本的使用




### 3. 总结


引用了该[文章](http://blog.csdn.net/itjianghuxiaoxiong/article/details/50177549)

ButterKnife 优势：

1.强大的View绑定和Click事件处理功能，简化代码，提升开发效率

2.方便的处理Adapter里的ViewHolder绑定问题

3.运行时不会影响APP效率，使用配置方便

4.代码清晰，可读性强

使用心得：

1.Activity ButterKnife.bind(this);必须在setContentView();之后，且父类bind绑定后，子类不需要再bind

2.Fragment ButterKnife.bind(this, mRootView);

3.属性布局不能用private or static 修饰，否则会报错

4.setContentView()不能通过注解实现。（其他的有些注解框架可以）



### 4. 代码混淆

	-keep class butterknife.** { *; }
	-dontwarn butterknife.internal.**
	-keep class **$$ViewBinder { *; }
	
	-keepclasseswithmembernames class * {
	    @butterknife.* <fields>;
	}
	
	-keepclasseswithmembernames class * {
	    @butterknife.* <methods>;
	}


### 5. Zelezny插件的使用

在AndroidStudio->File->Settings->Plugins->搜索Zelezny下载添加就行 ，可以快速生成对应组件的实例对象，不用手动写。使用时，在要导入注解的Activity 或 Fragment 或 ViewHolder的layout资源代码上，右键——>Generate——Generate ButterKnife Injections，然后就出现如图的选择框。（此动态图来自官网）

![](http://img.blog.csdn.net/20160324150702240)