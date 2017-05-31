As Default ApplicationContext initialize all the beans and store than inside itself.
We can configure so that bean is initialize when getBean() is called.
        
Bean Scopes:
> Singleton - When ApplicationContext is initialized then it creates an object and it stays there.
When some class call it then it returns reference to that object. 
When another class call it then it returns same objects again.
It doesn't create new object each time it's called. Object is created once.

> Prototype - here it works a bit different. New bean is created with every request or reference. When class calls 
this bean then spring container creates new bean and pass it to that class. New object every time. It doesn't have to be 
getBean(). It can be also a ref then it's also going to create new instance.

As Goes for <b> Request </b> then new bean is created per servlet. 

As Goes for <b> Session </b> then new bean is created per session.
So for example if new user is logged then new bean is created. If user stays logged then bean is not created. 

Another one is <b> Global Session </b> new bean for global HTTP session