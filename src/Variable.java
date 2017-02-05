/** ����Demo */
public class Variable {
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
		int intValue = 100;
		long longValue = 100L;
		byte byteValue = (byte) 128;// ����ᱨ���ԭ���ǣ�128�Ѿ�������byte�ķ�Χ����ֵ������Ϊint�����ˣ�IDEҪ�����ǽ��������byte��Χ����ǿ��ת��Ϊbyte����
		short shortValue = (short) 65566;// ���ﱨ���ԭ���������࣬������short�ķ�Χ��������Ϊint�����ˣ�ǿתΪshort������������
		// byte��short�����ö�������ǿ��ת����һ�£�����Ľ�������������ǿ�����ӡ�����Ľ����
		System.out.printf("intValue=%d \n", intValue);// => 100
		System.out.printf("longValue=%d \n", longValue);// => 100
		System.out.printf("byteValue=%d \n", byteValue);// => -128
		System.out.printf("shortValue=%d \n", shortValue);// => 30
		// Ϊ��������������Ԥ�ڲ�һ���أ�
		// ˵��ԭ��֮ǰ�������ȿ��������������͸��Ե����ֵ
		int intMaxValue = Integer.MAX_VALUE;// Integer Ϊint�������͵ķ�װ����
		long longMaxValue = Long.MAX_VALUE;// Long Ϊlong�������͵ķ�װ����
		byte byteMaxValue = Byte.MAX_VALUE;// Byte Ϊbyte�������͵ķ�װ����
		short shortMaxValue = Short.MAX_VALUE;// Short Ϊshort�������͵ķ�װ����
		System.out.printf("intMaxValue=%d \n", intMaxValue);// => 2147483647
		System.out.printf("longMaxValue=%d \n", longMaxValue);// =>
																// 9223372036854775807
																// ���ֵ����ȥ������˰����������������ݵķ�չ�����������ã���������˶�Ӧ�Ĵ���ֵ����
																// BigInteger
		System.out.printf("byteMaxValue=%d \n", byteMaxValue);// => 127
		System.out.printf("shortMaxValue=%d \n", shortMaxValue);// => 32767
		// ����Ϊ��ֱ�۵㣬��shortValue��ֵ��Ϊ(short)32768
		shortValue = (short) 32768;
		// �ٴ�ӡһ��
		System.out.printf("shortValue=%d \n", shortValue);// => -32768
		// ������byteValueΪ���Ͷ���
		// �����ٴ�ӡһ��byte����Сֵ������Ӧ�ø��������
		System.out.printf("byteMinValue=%d \n", Byte.MIN_VALUE);// => -128
		// ���ڷ�����û��byte�����ֵ��127����Сֵ��-128��(byte) 128 �Ľ����
		// -128���պ���byte����Сֵ������Ϊʲô�أ����֮ǰ���ٿ���(byte) 129�Ĵ�ӡ���
		byteValue = (byte) 129;
		System.out.printf("byteValue=%d \n", byteValue);// => -127
		// ���մ�ӡ��������ѿ������ɣ����ǳ���������Χ���ֻ����Сֵ��ʼ���㣬����1��������Сֵ������2��������Сֵ��1��
		// Ȼ����ֻ�Ǳ����ϵĽ��������ǿ����ײ�Ķ���
		// ������е����ݴ洢���Զ����Ʒ�ʽ��ŵģ�Ҳ������ν�� 0101...
		// ����Ҫ��������������ֽ�����λ��
		// �ֽ��� Ҳ���� byte����byteλ��Ϊ8λ
		// byteֵΪ 1�Ķ����Ʊ��Ϊ 00000001
		// byteֵΪ 127�Ķ����Ʊ��Ϊ 01111111
		// byteֵΪ -128�Ķ����Ʊ��Ϊ 11111111
		// �Ƿ����� Ϊ�� 127��-128 �Ͳ��1��127�ڰ�λΪ0,-128Ϊ1��
		// byte�����У��ڰ�λ�����ڱ����������0Ϊ������1Ϊ����
		// ����128������byte�ķ�Χ����˱�תΪint���ͣ���int����Ϊ32λ��128��int�еĶ����Ʊ��Ϊ 00000000 00000000 00000000 11111111
		// ����128ֵ�ѱ�����ǿ��ת��Ϊbyte���ͣ�byteΪ8λ��
		// ��ˣ�int�еĵڶ��������ĵ��ֽڱ������ˣ�ʣ�µ�һ�ֽڵı��Ϊ 11111111
		// �����Ϊʲô (byte)128 �����Ϊ-128 ��ԭ��
		// �ó����ۣ�ǿ��ת�����ܻ���ɾ��ȸı䣨�ؼ��֣����ܣ�
	}
}
