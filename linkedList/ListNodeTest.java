/**
 * 
 */
package linkedList;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author joncronin
 *
 */
public class ListNodeTest
{

   /**
    * Test method for {@link linkedList.ListNode#ListNode()}.
    */
   @Test
   public void testListNode()
   {
      ListNode someNode = new ListNode();
      assertTrue(someNode.data == null);
      assertTrue(someNode.next == null);
   }

   /**
    * Test method for {@link linkedList.ListNode#ListNode(java.lang.Object)}.
    */
   @Test
   public void testListNodeObject()
   {
      Integer someObject = new Integer(5);
      ListNode someNode = new ListNode();
      someNode = new ListNode(someObject);
      assertTrue(someNode.data == someObject);
      assertTrue((Integer)(someNode.data) == 5);
      assertTrue(someNode.next == null);
   }

   /**
    * Test method for {@link linkedList.ListNode#ListNode(java.lang.Object, linkedList.ListNode)}.
    */
   @Test
   public void testListNodeObjectListNode()
   {
      Integer someObject = new Integer(5);
      ListNode otherNode = new ListNode();
      ListNode someNode = new ListNode(someObject,otherNode);
      assertTrue(someNode.data == someObject);
      assertTrue((Integer)(someNode.data) == 5);
      assertTrue(someNode.next == otherNode);
   }

   /**
    * Test method for {@link linkedList.ListNode#getNodeData()}.
    */
   @Test
   public void testGetNodeData()
   {
      Integer someObject = new Integer(5);
      ListNode someNode = new ListNode(someObject);
      assertTrue(someNode.getNodeData() == someObject);
   }

   /**
    * Test method for {@link linkedList.ListNode#setNodeData(java.lang.Object)}.
    */
   @Test
   public void testSetNodeData()
   {
      Integer someObject = new Integer(5);
      ListNode someNode = new ListNode();
      assertTrue(someNode.setNodeData(someObject) == true);
      assertTrue(someNode.getNodeData() == someObject);
   }

   /**
    * Test method for {@link linkedList.ListNode#getNodeNext()}.
    */
   @Test
   public void testGetNodeNext()
   {
      Integer someObject = new Integer(5);
      ListNode someNode = new ListNode();
      ListNode otherNode = new ListNode(someObject,someNode);
      assertTrue(otherNode.getNodeNext() == someNode);
   }

   /**
    * Test method for {@link linkedList.ListNode#setNodeNext(linkedList.ListNode)}.
    */
   @Test
   public void testSetNodeNext()
   {
      ListNode someNode = new ListNode();
      ListNode otherNode = new ListNode();
      assertTrue(otherNode.setNodeNext(someNode) == true);
      assertTrue(otherNode.getNodeNext() == someNode);
      assertTrue(otherNode.setNodeNext(otherNode) == false);
      assertTrue(otherNode.getNodeNext() == someNode);
   }

   /**
    * Test method for {@link linkedList.ListNode#equals(linkedList.ListNode)}.
    */
   @Test
   public void testEqualsListNode()
   {
      Integer anObject = new Integer(1);
      Integer otherObject = new Integer(2);
      ListNode someNode = new ListNode();
      ListNode otherNode = new ListNode();
      assertTrue(otherNode.equals(someNode) == true);
      someNode.setNodeData(anObject);
      assertTrue(otherNode.equals(someNode) == false);
      otherNode.setNodeData(otherObject);
      assertTrue(otherNode.equals(someNode) == false);
   }

}
