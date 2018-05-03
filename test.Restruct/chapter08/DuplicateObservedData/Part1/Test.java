package chapter08.DuplicateObservedData.Part1;

 /**
  * 现在House和HousePriceObserver类的对象都需要使用price，如果想调用house对象的
  * setPrice方法，所有housePriceObserver对象的price也同步变化，那么：
  * 
  * 方案1：在setPrice方法传入需要变动的housePriceObserver对象（如果是多个，
  * 那么就是这种类型的集合），调用setPrice方法的同时就重新给housePriceObserver
  * 的price赋值
  * 
  * 方案2：将上面的过程抽象一个Observable类，这个类有add方法，可以加入需要关联的对象，
  * 有notifyObservers方法，可以调用所有被add进入的对象的update方法，
  * 
  * 方案3：继承Observable类和实现Observer接口，重写方法，在客户代码中调用add方法，建立
  * 关系，然后就能实现同步price变化
  * 
  * 方案1是最直观的，方案2是最全面，采用了模板，建立标准，重用的方式，方案3是最现成的方法是
  * 方案2的使用
  */
public class Test {

}
