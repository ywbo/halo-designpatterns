# Skyline of 《halo-designpatterns》

> - :a: author：yuwenbo
> - :alarm_clock: date：2022-05-26 00:00

> 每个人的心里，都有一个纯净的世界。
>
> 白天有和煦的阳光，一直温暖着自己，坚持下去，照亮每一个明天；
>
> 夜晚有静谧的月光，一直安慰着自己，洒向归途，不迷失初心方向。
>
> 在这个世界里，
>
> 不太焦虑，耐得住寂寞，用自律培养自信。最终以自信拥抱世界。
>
> 在这个世界里，
>
> 不张扬，因为真诚待人。
>
> 在这个世界里，
>
> 不喧哗，因为真实待己。
>
> 在这个世界里，
>
> 不荒芜，因为懂得珍惜。

----

### :fire: ​学习 `设计模式` 源码：[halo-designpatterns](https://github.com/ywbo/halo-designpatterns)
----
> 流转于指尖的记忆，即使一瞬，亦是永恒。 ——致自己

----

### 项目目录结构说明（以创建型模式的工厂方法模式为例）：

设计模式大体概括为：创建型模式（creational），结构型模式（structure），行为型模式（behavior）三类。每种大的分类下又有好几种具体的模式。

halo-creational-factorymethod    -- 创建型模式的工厂方法模式项目工程
│  ├─docs           -- 该设计模式概念，以及与其他设计的区别与联系
│  ├─factorymethod-00           -- xxxx-00：子模块，代表里面的类或者方法可能是xxxx-01模块，xxxx-02模块通用的，所以将其提出成公共部分
│  │  ├─src
│  │     ├─main
│  │     │  └─java
│  │     │      └─com
│  │     │          └─ilearning
│  │     │              └─design
│  │     │                  ├─card
│  │     │                  ├─coupon
│  │     │                  └─goods
│  │     └─test    -- 单元测试
│  │         └─java
│  ├─factorymethod-01          -- xxxx-01：没有使用【工厂方法设计模式】的代码实现，以便于和使用了设计模式的代码子模块产生对比学习，加深理解
│  │  ├─src
│  │     ├─main
│  │     │  └─java
│  │     │      └─com
│  │     │          └─ilearning
│  │     │              └─design
│  │     └─test          -- 单元测试
│  │         └─java
│  │             └─com
│  │                 └─ilearning
│  │                     └─design
│  │                         └─test
│  └─factorymethod-02          -- xxxx-02：使用【工厂方法设计模式】的代码实现，以便于和使用了设计模式的代码子模块产生对比学习，加深理解
│      ├─src
│         ├─main
│         │  └─java
│         │      └─com
│         │          └─ilearning
│         │              └─design
│         │                  └─commodity
│         │                      └─impl
│         └─test          -- 单元测试
│             └─java
│                 └─com
│                     └─ilearning
│                         └─design
│                             └─test



----

资料参考：

- [免费在线学习代码重构](https://refactoringguru.cn/)
- [软件设计模式](http://c.biancheng.net/view/1317.html)
