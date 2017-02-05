/** 变量Demo2 讲述一下其它基本类型 */
public class Variable2 {
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
		float floatValue = 2.0F;// 之所以报错，是因为默认的浮点型为双精度(double),我们可以选择用强制转换，也可以选择添加标识F(f)
		double doubleValue = 44.44;

		float floatMaxValue = Float.MAX_VALUE;// Float为float的封装类型
		double doubleMaxValue = Double.MAX_VALUE;// Double为double的封装类型

		System.out.printf("floatValue=%s \n", floatValue);// =>2.0
		System.out.printf("floatMaxValue=%s \n", floatMaxValue);// =>3.4028235E38
																// 被变成了 科学表达式了
		System.out.printf("doubleValue=%s \n", doubleValue);// =>44.44
		System.out.printf("doubleMaxValue=%s \n", doubleMaxValue);// =>1.7976931348623157E308
		// 两个最大值都被转为科学表达式，我都不知道该怎么说了 Float.MAX_VALUE 大概为 3.4028235 × 10 的38次方
		// 简直大得吓人
		// float 为 32位， double 为 64位
		// float的二进制表达我都忘了怎样了写了，让我有空再看看
		// 继续写 char 和 boolean

		char charValue = 11;// 是不是很奇怪，char居然可以用整数表达，原因是 char 的存储和
		// short差不多，但是char没有负数，char是从0开始到65535，我们输出一下
		System.out.println("Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		System.out.println("Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
		System.out.println("charValue=" + charValue);// => 乱码，因为编码表中没有对应的图像（文字）
		charValue = '1';
		System.out.println("charValue=" + charValue);// => 1
		// 让我们看看 char='1'转为 int后的值是什么
		System.out.println("charValue=" + (int) charValue);// => 49，也就是说，字符 '1'
															// 在编码表中对应编码为 49
		// 字符 '1' 对应的编码为49，那么 a到z，A到Z呢？分别对应的编码是什么？
		// 为了方便，我们写个小Demo
		for (int a = (int) 'a'; a <= (int) 'z'; a++) {
			System.out.println((char) a + "=" + a);// => 97~122
		}
		// 再看看 A到Z的，demo是在 a到z的基础上修改
		for (int a = (int) 'A'; a <= (int) 'Z'; a++) {
			System.out.println((char) a + "=" + a);// => 65~90
		}
		// 也就是说，A~Z为 65~90，a~z为97~122，为何Z到a之间隔了6个字符？到底这6个字符是什么？我们打印看一下吧。
		for (int i = 91; i < 97; i++) {// 写到这里，我感觉这6个字符都是没东西的，不管了，还是写完demo，输出看结果
			System.out.println(i + "=" + (char) i);// => [ \ ] ^ _ `
													// 真是意外，居然这6个字符乱入进去A-Za-z之间了，想不通编码表制定的人怎么想的
		}
		// 好了，我们接着讲 boolean （布尔值）
		// 布尔值到底是什么？布尔值在不同的语言中有不同的表达形式，例如：二进制为 0,1 ;Java、JavaScript、C\C++
		// 为true，false;Objective-C 为 Yes，No（true，false 也行）;
		// 在Java中，布尔值的int表达为0，1，我们输出看一下吧
		boolean trueValue = true;
		boolean falseValue = false;
		System.out.println("trueValue=" + trueValue);// => true
		System.out.println("falseValue=" + falseValue);// => false
		// 好吧，一时之间，我都忘了怎么验证 true 就是1，false 就是0，容我想想
		// 想不动了，算了。Boolean 为boolean的封装类型
		System.out.println("Boolean.TRUE=" + Boolean.TRUE.booleanValue());
		System.out.println("Boolean.FALSE=" + Boolean.FALSE.booleanValue());

		// Java中8中基本类型介绍完了。现在，我们用布尔值配合for循环玩一玩东西，顺便使用一下Thread中的一个Api
		int counter = 0;
		for (; true;) {// 写一个死循环
			System.out.println("计数器输出:" + counter);
			try {// 这里加入线程休眠，以免搞崩虚拟机
				Thread.sleep(100);// 这里会出现报错，原因是这个方法会抛出异常（后面再描述什么是异常），我们必须要处理掉。
			} catch (Exception e) {// 我们先用 try-catch
									// 处理该异常，在后面直播中，会详细说清楚处理异常的多种方法
				e.printStackTrace();// 这里是打印异常中的栈信息。什么是栈？今天先不说。但我们可以点进去看看
									// Exception 这个东西是什么。
			}
			// 如果我们写一个死循环，可能会搞崩虚拟机，为了不破环整个环境，我们拟定一个条件，用于跳出这个死循环。
			// 我们拟定，当counter大于14，就跳出循环
			// 为了写这个逻辑，我们需要用到 if 条件语句， if(条件/布尔值)，当符合条件或布尔值为true，则执行内部方法快
			if (counter > 14) {// 当counter大于14，则执行下面语句
				break;// 用于跳出循环
			}
			//刚才犯了个错误，没有给counter重新赋值，所以上面的if条件语句永远不成立
			//现在我们添加一个给counter赋值的语句
			counter++;//后面会跟大家说说 ++x,x++,+=x 之间的区别或共同点
			
			//输出为 0~15 
			//为何不是 0~14呢？
			//原因在于，我们是先输出，再判断，最后才赋值，如此循环。
			//所以，当counter为15时，先输出值，再判断是否大于14。发现大于15>14，因此跳出循环。
		}
	}
}
