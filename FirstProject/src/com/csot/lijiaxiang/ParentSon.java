package com.csot.lijiaxiang;
class Fu
{
    Fu()
    {
        super();
        show();  //ͨ��������Կ������Ӹ�����ͬ��show���������õ�������show������
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
        //-->ͨ��super��ʼ����������ʱ������ĳ�Ա������δ��ʾ��ʼ������super()�����ʼ����Ϻ�
        //�Ž�������ĳ�Ա������ʾ��ʼ����

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
