package enviromine.util;

import java.lang.reflect.Array;

public class Utils
{
	/**
	 * Dear me: stop being a moron, remember this returns! It doesn't modify it straight up!<br>
	 * (If you aren't me, sorry, but still heed this warning :P)
	 * 
	 * @param array
	 * @param toAppend
	 * @return Appended array
	 */
	@SuppressWarnings("unchecked")
	public static <E> E[] append(E[] array, E toAppend)
	{
		E[] temp = array;
		array = (E[])Array.newInstance(toAppend.getClass(), temp.length+1);
		
		for (int i = 0; i < temp.length; i++) {
			array[i] = temp[i];
		}
		
		array[temp.length] = toAppend;
		
		return array;
	}
}