# 设计模式概述

## 设计模式描述：

桥接模式的主要作用就是 `通过将抽象部分与实现部分分离，把多种可匹配的使用进行组合。` 说白了核心实现也就是在A类中含有B类接口，通过构造函数传递B类的实现，这个B类就是设计的桥。
我们日常开发中的场景：JDBC有多种驱动的实现、同品牌类型的台式机和笔记本平板、业务实现中的多类接口同组过滤服务等。这些场景都比较适合使用 `桥接模式` 进行实现，
因为在一些组合中如果每一类实现不同的服务可能会出现笛卡尔积，而使用桥接模式就可以非常简单。

## 业务场景：

场景模拟工程，我们平常支付就是使用微信、支付宝、云闪付... 但对于商家来说，并不想改变我们的支付习惯，所以此时第三方平台的出现，整合支付服务到自己的平台中， 再把这样的支付平台提供给超市、商贩、地摊...
这样再不改变用户支付习惯的基础上，还支持多种支付方式。 我们就模拟第三方支付平台承接各个支付能力，同时使用自家的人脸识别让用户支付起来更加便捷。那么这里就会出现 `多支付` 与 `多模式` 的融合使用。

## 模块含义

*-00：代表模拟的场景（使用设计模式前后公用的类）；
*-01：传统业务逻辑实现（非设计模式实现）；
*-02：通过设计模式优化重构后，业务逻辑的实现。