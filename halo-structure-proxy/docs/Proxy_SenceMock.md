# 设计模式概述

## 外观模式描述

`代理模式` ，是一种结构型设计模式，让你能够提供对象的代替品或者占位符。代理控制着对于原对象的访问，并允许在将请求提交给对象前后进行一些处理。

## 与其他设计模式的关系：

• [适配器]()能为被封装对象提供不同的接口，[代理]()能为对象提供 相同的接口，[装饰]()则能为对象提供加强的接口。

• [外观]()与[代理]()的相似之处在于它们都缓存了一个复杂实体并自 行对其进行初始化。[代理]()与其服务对象遵循同一接口，使得 自己和服务对象可以互换，在这一点上它与外观不同。

• [装饰]()和[代理]()有着相似的结构，但是其意图却非常不同。这两 个模式的构建都基于组合原则，也就是说一个对象应该将部 分工作委派给另一个对象。两者之间的不同之处在于代理通 常自行管理其服务对象的生命周期，而装饰的生成则总是由
客户端进行控制。

## 业务场景

这里我们来模拟`MyBatis中对类的代理过程`的业务场景。

- 定义接口
- 关联到方法注解中对 `sql` 语句完成对数据库的操作。

在本案例中我们将模拟实现
MyBatis-Spring中代理类实现生成部分。我们都知道，对于MyBatis的使用，我们只需要调用接口，不需要写实现类就可以完成增删改查的操作，那么具体为什么我们只需进行接口定义的操作呢？接下来我们通过实现这样一个管理类，交给Spring管理的核心核心过程，来讲述代理模式。

## 模块含义

*-00：模拟MyBatis开发中间件代理类部分；  
*-01：传统业务逻辑实现（非设计模式实现）；  
*-02：通过设计模式优化重构后，业务逻辑的实现。