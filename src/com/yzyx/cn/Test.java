package com.yzyx.cn;

import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		/*
		 * Random r = new Random(); int param = r.nextInt(900000)+100000; String
		 * str = String.valueOf(param); String[] array = new
		 * String[str.length()]; for(int i=0; i<str.length(); i++){ array[i] =
		 * str.charAt(i) + ""; } for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */
		// System.out.println(new
		// String("\u6A21\u7248\u672A\u5BA1\u6279\u6216\u5185\u5BB9\u4E0D\u5339\u914D\uFF0C\u9519\u8BEF\u8BE6\u89E3\u89C1"));

		// Arrays.asList( "a", "b", "d" ).forEach( p -> System.out.println( p )
		// );
		/*
		 * Arrays.asList( "a", "b", "d" ).forEach( e -> { System.out.print( e );
		 * System.out.print( e ); } );
		 */
		/*
		 * String separator = ","; Arrays.asList( "a", "b", "d" ).forEach( (
		 * String e ) -> System.out.print( e + separator ) ); final String
		 * separator = ","; Arrays.asList( "a", "b", "d" ).forEach( ( String e )
		 * -> System.out.print( e + separator ) );
		 */

		/*
		 * Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 )
		 * );
		 * 
		 * Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> { int result =
		 * e1.compareTo( e2 ); return result; } );
		 */
		// System.out.println(String.valueOf(LocalDate.now()).replace("-","."));
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss"); 
		 * String newDate = sdf.format(new Date()); 
		 * String result=""; Random random=new Random(); 
		 * for(int i=0;i<3;i++){ 
		 * 		result+=random.nextInt(10); 
		 * }
		 * System.out.println(newDate+result);
		 */
		System.out.println(String.valueOf(LocalTime.now()).substring(0,8));
		System.out.println("456789");
		System.out.println("123");
		System.out.println("123456");
	}
}
