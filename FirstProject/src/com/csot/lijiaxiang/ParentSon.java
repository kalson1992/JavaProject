package com.csot.lijiaxiang;
class Fu
{
    Fu()
    {
        super();
        show();  //通过结果可以看出，子父类有同名show方法，调用的是子类show方法。
        return;
    }

    void show()
    {
        System.out.println("fu show");
    }
}

class Zi extends Fu
{
    int num = 8;
    Zi()
    {
        super();
        //-->通过super初始化父类内容时，子类的成员变量并未显示初始化。等super()父类初始化完毕后，
        //才进行子类的成员变量显示初始化。

        System.out.println("zi cons run...."+num);
        return;
    }
    void show() 
    {
        System.out.println("zi show..."+num);
    }
}

public class ParentSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Zi z = new Zi(); 
	        z.show();
//test git1231311123333
	}

}
