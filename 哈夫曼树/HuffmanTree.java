import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class HuffmanTree
{
	public static <T> Node<T> createTree(List<Node<T>> nodes){
		while(nodes.size()>1){
			Collections.sort(nodes);
			//left right节点分别为weight最小的两个点
			Node<T> left=nodes.get(nodes.size()-1);
			Node<T> right=nodes.get(nodes.size()-2);
			Node<T> parent=new Node<T>(null, left.getWeight()+right.getWeight());  //创建父节点
			parent.setLeft(left);  
			parent.setRight(right);
			nodes.remove(left);
			nodes.remove(right);
			nodes.add(parent);
		}
		return nodes.get(0);  //nodes.get(0)有完整的树结构
	}
	
	public static <T> List<Node<T>> breath(Node<T> root){
		List<Node<T>> list=new ArrayList<>();
		Queue<Node<T>> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node<T> pNode=queue.poll();  //把队头推出来
			list.add(pNode);
			if(pNode.getLeft()!=null){
				queue.add(pNode.getLeft());
			}
			if(pNode.getRight()!=null){
				queue.add(pNode.getRight());
			}
		}
		return list; //list为完整的序列
	}
}
