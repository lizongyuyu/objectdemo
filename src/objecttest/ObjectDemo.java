package objecttest;
/**
 * 
 * @author Nick
 *
 */
public class ObjectDemo {
	public static void main(String[] args) {
		/**
		 * toString()
		 * ������дtoString������alt+s����дtoString�ķ���
		 */
		/*Object x = new Objects();
		System.out.println(x.toString());*/
		
		/**
		 * equals()
		 * ��Object���ж����������Ƿ������ͬ�����ã����Ƿ�Ϊ��ͬ�Ķ���
		 * ��ʵ��Ӧ���У�һ����д�÷�����ͨ���Ƚ϶���ĳ�Ա���ԣ�ʹ�ķ�����������
		 * Object��equals()�����൱��==
		 * ==:�����ǻ������ݵ���ֵ���ͣ���ôֱ�ӱȽϴ�С������������������ͣ���ʱ�Ƚϵ������������Ƿ�
		 * ָ��ͬһ�����󣬴�ʱ��Object���е�equals()������ͬ
		 */
		Objects point1 = new Objects(10,12);
		Objects point2 = new Objects(10,12);
		boolean flag = point1.equals(point2);
		System.out.println(flag);
	}

}
