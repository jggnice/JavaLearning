package a1018;

import java.util.HashMap;

public class Homework5
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("CN", "�л����񹲺͹�");
		map.put("US", "��������ڹ�");
		map.put("RU", "����˹����");
		map.put("JP", "�ձ�");
		System.out.println("CN��Ӧ�Ĺ�����:" + map.get("CN"));
		System.out.println("Map�й���"+ map.size()+"������");
		System.out.println("Map�а���JP��key��?"+map.containsKey("JP"));
		map.remove("JP");
		System.out.println("Map�а���JP��key��?"+map.containsKey("JP"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		map.clear();
		System.out.println("�Ѿ����Map������!");
	}
}
