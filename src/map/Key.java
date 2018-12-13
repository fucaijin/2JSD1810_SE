package map;

/**
 * HashMap�ǵ����ѯ�ٶ��������ݽṹ.������ΪkeyԪ�ص�hashCode()������equals()������ʵ��������׵�,�ͻή��ɢ�б�Ĳ�ѯ����
 * ��HashMap�г�������ͻ�Ӱ�����ѯ����,�����������һ����Ҫԭ����:
 * ������KeyԪ�ص�hashCodeֵ(hashCode()�������ص�����)��ͬʱ(hashCode������Ԫ����HashMap�ڲ�������±�λ��)������equals�Ƚϲ�Ϊtrue
 * (equals��������HashMap�Ƿ���Ϊ������keyΪ�ظ���)ʱ,�����HashMap�ڲ��γ�����.
 * 
 * hashCode()������equals()������Object����ķ���,������������API�ֲ��Object��������ȷ��˵��:
 * ��������Ҫ��дһ�����equals()��hashCode()����ʱ,Ҫ��ѭ���漸��Ҫ��:
 * 1.�ɶ���д,��������дһ�����equals()����ʱ,��Ӧ����ͬ��дhashCode,������Ҳһ��
 * 2.һ����,�����������equals�Ƚ�Ϊtrueʱ,hashCode()�������ص����ֱ������.���������Ǳ����,����Ҳ������֤����������hashCode��ͬʱequals()�Ƚ�ҲΪtrue
 * 3.�ȶ���,��һ���������equals�Ƚϵ�����ֵû�з������ı��ǰ����,��ε���hashCode�������ص�����Ӧ������.(��һ�����������û�б仯ʱ,���ô˶����hashCode()���صĽ��Ӧ���ǲ����)
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

}
