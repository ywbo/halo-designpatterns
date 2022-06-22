# 设计模式概述

## 责任链模式描述

`迭代器模式` ，是一种行为设计模式，允许你在不暴露集合底层实现形式（列表、栈和树等）的情况下遍历集合中的所有元素。

## 与其他设计模式的关系：

- 你可以使用迭代器来遍历组合树。 
- 你可以同时使用工厂方法和迭代器来让子类集合返回不同类 型的迭代器，并使得迭代器与集合相匹配。
- 你可以同时使用备忘录和迭代器来获取当前迭代器的状态， 并且在需要的时候进行回滚。 
- 可以同时使用访问者和迭代器来遍历复杂数据结构，并对其 中的元素执行所需操作，即使这些元素所属的类完全不同。

## 业务场景

这里我们来模拟`开发树形组织架构关系迭代器`。使用 `迭代器` 遍历树形组织结构。

## 模块含义

- 00：迭代器模式遍历组织结构；