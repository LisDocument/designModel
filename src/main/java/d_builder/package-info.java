/**
 * 对于建造者模式而已，它主要是将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示。适用于那些产品对象的内部结构比较复杂。
 *
 * 建造者模式将复杂产品的构建过程封装分解在不同的方法中，
 * 使得创建过程非常清晰，能够让我们更加精确的控制复杂产品对象的创建过程，
 * 同时它隔离了复杂产品对象的创建和使用，使得相同的创建过程能够创建不同的产品。
 * 但是如果某个产品的内部结构过于复杂，将会导致整个系统变得非常庞大，不利于控制，
 * 同时若几个产品之间存在较大的差异，则不适用建造者模式，毕竟这个世界上存在相同点大的两个产品并不是很多，所以它的使用范围有限。
 */
package d_builder;