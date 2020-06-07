package ��ƽ��Ƕ���б������;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

/*
 * ˼·��ͨ���ݹ�ķ��������������ݣ��������ͷ���List���������ٴεݹ����
 */
public class NestedIterator {
	private List<Integer> list;
    private int index;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = Integer_iteration(nestedList);
        index = -1;
    }

    @Override
    public Integer next() {
        return list.get(++index);
    }

    @Override
    public boolean hasNext() {
        return index + 1 < list.size();
    }

    private static List<Integer> Integer_iteration(List<NestedInteger> nestedList)
    {
        List<Integer> list =  new ArrayList<>(nestedList.size());
        for(NestedInteger temp:nestedList)
        {
            if(temp.isInteger())
                list.add(temp.getInteger());
            else
                list.addAll(Integer_iteration(temp.getList()));
        }
        return list;
    }

}
