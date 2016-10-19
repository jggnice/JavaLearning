package a1018;

import java.util.HashMap;

public class Homework5
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚合众国");
		map.put("RU", "俄罗斯联邦");
		map.put("JP", "日本");
		System.out.println("CN对应的国家是:" + map.get("CN"));
		System.out.println("Map中共有"+ map.size()+"组数据");
		System.out.println("Map中包含JP的key吗?"+map.containsKey("JP"));
		map.remove("JP");
		System.out.println("Map中包含JP的key吗?"+map.containsKey("JP"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		map.clear();
		System.out.println("已经清空Map中数据!");
	}
}
