# BaseApp

写这个是为了android 应用的快速开发，主要是要写一些基类，引用一些第三方库(proguard混淆)，并兼容tv,wear,glass等平台。一开始这里会什么都有，比较大
以后可能会分得更细，用更多的模块来实现，也可能会使用一些开发模式(mvp)什么的。希望有点用。

由于各个module都是引用方式导入，所以当你clone BaseApp时并不会拉取到所有模块的代码，你还需要以下操作:
1.git submodule init
2.git submodule update
