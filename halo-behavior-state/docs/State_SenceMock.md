# 设计模式概述

## 状态模式描述

`状态模式` ，是一种行为设计模式，能让你在一个对象的内部状态变化时，改变其行为，使其看上去就像是改变了自身所属的类一样。

## 与其他设计模式的关系：

- [接接]()、[状态]()和[策略]()（在某种程度上包括适配器）模式的接口 非常相似。实际上，它们都基于组合模式——即将工作委派 给其他对象，不过也各自解决了不同的问题。模式并不只是 以特定方式组织代码的配方，你还可以使用它们来和其他开 发者讨论模式所解决的问题。
- 状态可被视为策略的扩展。两者都基于组合机制：它们都通 过将部分工作委派给“帮手”对象来改变其在不同情景下的 行为。策略使得这些对象相互之间完全独立，它们不知道其 他对象的存在。 但状态模式没有限制具体状态之间的依赖， 且允许它们自行改变在不同情景下的状态。。

## 业务场景

在本案例中我们通过 `模拟营销活动审核状态流转场景(⼀个活动的上线是多个层级审核上线的)`。

## 模块含义

* 00：场景模拟⼯程；模拟营销活动操作服务(查询、审核)
* 01：使用非设计模式实现业务场景；
* 02：使用设计模式优化重构后，实现业务场景。