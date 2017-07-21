package 对象数组作业;

//包含了查询 添加 修改 删除 按id查询 排序的方法
public class RenCz {
	//查询全部的方法
	//需要一个参数,你要查谁
	public void selectAll(Ren[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != null)
			{
				arr[i].xianshi();
			}
		}
	}
	
	//向数组中添加的方法
	//两个参数,向哪里添加，添加的是什么
	public Ren[] add(Ren[] arr,Ren ren)
	{
		//循环数组，看看数组第几个元素的位置是空的，把ren的对象放上去.
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == null)
			{
				arr[i] = ren;
				//结束循环
				break;
			}
		}
		return arr;
	}
	
	//修改 按照id修改
	//两个参数，要改谁，要改成什么
	public Ren[] edit(Ren[] arr,Ren ren)
	{
		for(int i=0;i<arr.length;i++)
		{
			//找到要修改的id
			if(arr[i].getId() == ren.getId()) {
				arr[i].setNl(ren.getNl());
				arr[i].setXb(ren.getXb());
				arr[i].setXm(ren.getXm());
				break;
			}
		}
		return arr;
	}
	
	//删除 按照id做删除
	//两个参数，从哪里删，要删除id号
	public Ren[] delete(Ren[] arr,int id)
	{
		//先找到这个对象
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getId() == id)
			{
				//删除
				arr[i] = null;
				break;
			}
		}
		return arr;
		
	}
	
	
	//查询 按照id查询
	//要在哪里找，找那个id
	public void selectById(Ren[] arr, int id)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getId() == id)
			{
				arr[i].xianshi();
				break;
			}
		}
	}
	
	
}
