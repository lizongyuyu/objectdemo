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
		 * 建议重写toString方法，alt+s有重写toString的方法
		 */
		/*Object x = new Objects();
		System.out.println(x.toString());*/
		
		/**
		 * equals()
		 * 在Object中判断两个对象是否具有相同的引用，即是否为相同的对象
		 * 在实际应用中，一般重写该方法，通过比较对象的成员属性，使改方法更有意义
		 * Object中equals()方法相当于==
		 * ==:两边是基本数据的数值类型，那么直接比较大小，如果两边是引用类型，此时比较的是两个引用是否
		 * 指向同一个对象，此时和Object类中的equals()方法相同
		 */
		Objects point1 = new Objects(10,12);
		Objects point2 = new Objects(10,12);
		boolean flag = point1.equals(point2);
		System.out.println(flag);
	}

}
