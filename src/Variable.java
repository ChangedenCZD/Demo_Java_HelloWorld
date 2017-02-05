/** 变量Demo */
public class Variable {
	/*
	 * Java 有以下几种基本数据类型
	 * 
	 * 整数型： int， 整数型 long， 长整型 byte， 字节型 short (忘了怎么描述)
	 * 
	 * 浮点型： float 单精度浮点型，， double 双精度浮点型
	 * 
	 * 字符型： char 字符型
	 * 
	 * 布尔值： boolean 布尔值
	 */

	public static void main(String[] args) {
		int intValue = 100;
		long longValue = 100L;
		byte byteValue = (byte) 128;// 这里会报错的原因是，128已经超出了byte的范围，该值被定义为int类型了，IDE要求我们将这个超出byte范围的至强制转换为byte类型
		short shortValue = (short) 65566;// 这里报错的原因与上面差不多，超出了short的范围，被定义为int类型了，强转为short就能消除报错。
		// byte和short的引用都被我们强制转换了一下，但真的解决问题了吗？我们看看打印出来的结果。
		System.out.printf("intValue=%d \n", intValue);// => 100
		System.out.printf("longValue=%d \n", longValue);// => 100
		System.out.printf("byteValue=%d \n", byteValue);// => -128
		System.out.printf("shortValue=%d \n", shortValue);// => 30
		// 为何输出结果和我们预期不一致呢？
		// 说出原因之前，我们先看看以上四种类型各自的最大值
		int intMaxValue = Integer.MAX_VALUE;// Integer 为int基本类型的封装对象
		long longMaxValue = Long.MAX_VALUE;// Long 为long基本类型的封装对象
		byte byteMaxValue = Byte.MAX_VALUE;// Byte 为byte基本类型的封装对象
		short shortMaxValue = Short.MAX_VALUE;// Short 为short基本类型的封装对象
		System.out.printf("intMaxValue=%d \n", intMaxValue);// => 2147483647
		System.out.printf("longMaxValue=%d \n", longMaxValue);// =>
																// 9223372036854775807
																// 这个值看上去大的吓人啊，但是在如今大数据的发展，根本不够用，因此引入了对应的大数值对象
																// BigInteger
		System.out.printf("byteMaxValue=%d \n", byteMaxValue);// => 127
		System.out.printf("shortMaxValue=%d \n", shortMaxValue);// => 32767
		// 我们为了直观点，将shortValue的值变为(short)32768
		shortValue = (short) 32768;
		// 再打印一次
		System.out.printf("shortValue=%d \n", shortValue);// => -32768
		// 我们以byteValue为解释对象
		// 我们再打印一下byte的最小值，这样应该更好理解了
		System.out.printf("byteMinValue=%d \n", Byte.MIN_VALUE);// => -128
		// 现在发现了没？byte的最大值是127，最小值是-128，(byte) 128 的结果是
		// -128，刚好是byte的最小值，这是为什么呢？解答之前，再看看(byte) 129的打印结果
		byteValue = (byte) 129;
		System.out.printf("byteValue=%d \n", byteValue);// => -127
		// 按照打印结果，不难看出规律，就是超出正数范围部分会从最小值开始计算，超出1，则是最小值；超出2，则是最小值加1。
		// 然而这只是表面上的解析，我们看看底层的东西
		// 计算机中的数据存储是以二进制方式存放的，也就是所谓的 0101...
		// 这里要引入两个概念——字节数和位数
		// 字节数 也就是 byte数，byte位数为8位
		// byte值为 1的二进制表达为 00000001
		// byte值为 127的二进制表达为 01111111
		// byte值为 -128的二进制表达为 11111111
		// 是否很奇怪 为何 127和-128 就差个1（127第八位为0,-128为1）
		// byte类型中，第八位数用于表达正负数，0为正数，1为负数
		// 由于128超出了byte的范围，因此被转为int类型，而int类型为32位，128在int中的二进制表达为 00000000 00000000 00000000 11111111
		// 由于128值已被我们强制转换为byte类型（byte为8位）
		// 因此，int中的第二，三，四的字节被砍掉了，剩下第一字节的表达为 11111111
		// 这就是为什么 (byte)128 会输出为-128 的原因
		// 得出结论，强制转换可能会造成精度改变（关键字：可能）
	}
}
