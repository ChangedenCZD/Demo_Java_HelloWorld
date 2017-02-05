/** ����Demo2 ����һ�������������� */
public class Variable2 {
	/*
	 * Java �����¼��ֻ�����������
	 * 
	 * �����ͣ� int�� ������ long�� ������ byte�� �ֽ��� short (������ô����)
	 * 
	 * �����ͣ� float �����ȸ����ͣ��� double ˫���ȸ�����
	 * 
	 * �ַ��ͣ� char �ַ���
	 * 
	 * ����ֵ�� boolean ����ֵ
	 */

	public static void main(String[] args) {
		float floatValue = 2.0F;// ֮���Ա�������ΪĬ�ϵĸ�����Ϊ˫����(double),���ǿ���ѡ����ǿ��ת����Ҳ����ѡ����ӱ�ʶF(f)
		double doubleValue = 44.44;

		float floatMaxValue = Float.MAX_VALUE;// FloatΪfloat�ķ�װ����
		double doubleMaxValue = Double.MAX_VALUE;// DoubleΪdouble�ķ�װ����

		System.out.printf("floatValue=%s \n", floatValue);// =>2.0
		System.out.printf("floatMaxValue=%s \n", floatMaxValue);// =>3.4028235E38
																// ������� ��ѧ���ʽ��
		System.out.printf("doubleValue=%s \n", doubleValue);// =>44.44
		System.out.printf("doubleMaxValue=%s \n", doubleMaxValue);// =>1.7976931348623157E308
		// �������ֵ����תΪ��ѧ���ʽ���Ҷ���֪������ô˵�� Float.MAX_VALUE ���Ϊ 3.4028235 �� 10 ��38�η�
		// ��ֱ�������
		// float Ϊ 32λ�� double Ϊ 64λ
		// float�Ķ����Ʊ���Ҷ�����������д�ˣ������п��ٿ���
		// ����д char �� boolean

		char charValue = 11;// �ǲ��Ǻ���֣�char��Ȼ������������ԭ���� char �Ĵ洢��
		// short��࣬����charû�и�����char�Ǵ�0��ʼ��65535���������һ��
		System.out.println("Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		System.out.println("Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
		System.out.println("charValue=" + charValue);// => ���룬��Ϊ�������û�ж�Ӧ��ͼ�����֣�
		charValue = '1';
		System.out.println("charValue=" + charValue);// => 1
		// �����ǿ��� char='1'תΪ int���ֵ��ʲô
		System.out.println("charValue=" + (int) charValue);// => 49��Ҳ����˵���ַ� '1'
															// �ڱ�����ж�Ӧ����Ϊ 49
		// �ַ� '1' ��Ӧ�ı���Ϊ49����ô a��z��A��Z�أ��ֱ��Ӧ�ı�����ʲô��
		// Ϊ�˷��㣬����д��СDemo
		for (int a = (int) 'a'; a <= (int) 'z'; a++) {
			System.out.println((char) a + "=" + a);// => 97~122
		}
		// �ٿ��� A��Z�ģ�demo���� a��z�Ļ������޸�
		for (int a = (int) 'A'; a <= (int) 'Z'; a++) {
			System.out.println((char) a + "=" + a);// => 65~90
		}
		// Ҳ����˵��A~ZΪ 65~90��a~zΪ97~122��Ϊ��Z��a֮�����6���ַ���������6���ַ���ʲô�����Ǵ�ӡ��һ�°ɡ�
		for (int i = 91; i < 97; i++) {// д������Ҹо���6���ַ�����û�����ģ������ˣ�����д��demo����������
			System.out.println(i + "=" + (char) i);// => [ \ ] ^ _ `
													// �������⣬��Ȼ��6���ַ������ȥA-Za-z֮���ˣ��벻ͨ������ƶ�������ô���
		}
		// ���ˣ����ǽ��Ž� boolean ������ֵ��
		// ����ֵ������ʲô������ֵ�ڲ�ͬ���������в�ͬ�ı����ʽ�����磺������Ϊ 0,1 ;Java��JavaScript��C\C++
		// Ϊtrue��false;Objective-C Ϊ Yes��No��true��false Ҳ�У�;
		// ��Java�У�����ֵ��int���Ϊ0��1�����������һ�°�
		boolean trueValue = true;
		boolean falseValue = false;
		System.out.println("trueValue=" + trueValue);// => true
		System.out.println("falseValue=" + falseValue);// => false
		// �ðɣ�һʱ֮�䣬�Ҷ�������ô��֤ true ����1��false ����0����������
		// �벻���ˣ����ˡ�Boolean Ϊboolean�ķ�װ����
		System.out.println("Boolean.TRUE=" + Boolean.TRUE.booleanValue());
		System.out.println("Boolean.FALSE=" + Boolean.FALSE.booleanValue());

		// Java��8�л������ͽ������ˡ����ڣ������ò���ֵ���forѭ����һ�涫����˳��ʹ��һ��Thread�е�һ��Api
		int counter = 0;
		for (; true;) {// дһ����ѭ��
			System.out.println("���������:" + counter);
			try {// ��������߳����ߣ������������
				Thread.sleep(100);// �������ֱ���ԭ��������������׳��쳣������������ʲô���쳣�������Ǳ���Ҫ�������
			} catch (Exception e) {// �������� try-catch
									// ������쳣���ں���ֱ���У�����ϸ˵��������쳣�Ķ��ַ���
				e.printStackTrace();// �����Ǵ�ӡ�쳣�е�ջ��Ϣ��ʲô��ջ�������Ȳ�˵�������ǿ��Ե��ȥ����
									// Exception ���������ʲô��
			}
			// �������дһ����ѭ�������ܻ����������Ϊ�˲��ƻ����������������ⶨһ���������������������ѭ����
			// �����ⶨ����counter����14��������ѭ��
			// Ϊ��д����߼���������Ҫ�õ� if ������䣬 if(����/����ֵ)�������������򲼶�ֵΪtrue����ִ���ڲ�������
			if (counter > 14) {// ��counter����14����ִ���������
				break;// ��������ѭ��
			}
			//�ղŷ��˸�����û�и�counter���¸�ֵ�����������if���������Զ������
			//�����������һ����counter��ֵ�����
			counter++;//���������˵˵ ++x,x++,+=x ֮��������ͬ��
			
			//���Ϊ 0~15 
			//Ϊ�β��� 0~14�أ�
			//ԭ�����ڣ�����������������жϣ����Ÿ�ֵ�����ѭ����
			//���ԣ���counterΪ15ʱ�������ֵ�����ж��Ƿ����14�����ִ���15>14���������ѭ����
		}
	}
}
