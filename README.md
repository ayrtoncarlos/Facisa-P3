# Facisa-P3

Repository of exercises and projects of graduation period 2017.2.

Discipline: Programming III

Teacher: [Daniel Abella](https://github.com/daniel-abella)

College: University Center [UNIFACISA](http://www.cesed.br/portal/)

Course: Bachelor of Information Systems


# Projects in JAVA

<h3> Singleton </h3>
    <dt> Some examples of Singleton implementations in the Java programming language: </dt>
		<ol>
			<li> Singleton without Competition </li>
			<li> Singleton Competitor </li>
			<li> Concurrent Singleton with Minimum Synchronization </li>
			<li> Beware of Multiple Commands </li>
			<li> Singleton Preloaded and No Synchronization </li>
			<li> Singleton concurrent and without synchronization </li>
			<li> Enum Singleton Class </li>
		</ol>

<h3> Visibility of classes and methods </h3>
 	<dt> Some examples of class and method visibility in the Java programming language: </dt>
 		<h5> Classes: </h5>
 			<ol>
				<li> Default class </li>
				<li> Private class </li>
				<li> Protected class </li>
				<li> Public class </li>
			</ol>	
		<h5> Methods: </h5>
 			<ol>
				<li> Default method </li>
				<li> Private method </li>
				<li> Protected method </li>
				<li> Public method </li>
			</ol>
<h4> Sorting Algorithms </h4>

<h2> Bubble Sort </h2>
	<dt> Method of simple implementation of the ordering algorithm Bubble Sort with JUnit 4 tests. </dt>
	
<h2> Level Order Tree Traversal with Queue. </h2>
	<dt> Level order traversal of a tree is breadth first traversal for the tree with Queue. </dt>
	
<h4> Algorithm: </h4>
	<dt> For each node, first the node is visited and then it’s child nodes are put in a FIFO queue. </dt>
	
	printLevelorder(tree)
		1) Create an empty queue q.
		2) temp_node = root /*start from root*/.
		3) Loop while temp_node is not NULL:
			a) print temp_node->data.
			b) Enqueue temp_node’s children (first left then right children) to q.
			c) Dequeue a node from q and assign it’s value to temp_node.
		   
<h4> Time Complexity: </h4> 
	<dt> O(n) where n is number of nodes in the binary tree. </dt>
	
<h3> Simple implementation of a Deque with linked list and tests with JUnit 4. </h3>
	<dt> A simple implementation in the Java language of a Deque with linked list and JUnit test cases. </dt>
	
<h3> Simple implementation of a Deque with tests in JUnit 4. </h3>
	<dt> A simple implementation in the Java language of a Deque with JUnit test cases. </dt>
	
<h3> Simple implementation of a Stack with tests in JUnit 4. </h3>
	<dt> A simple implementation in the Java language of a Stack with JUnit test cases. </dt>

<h3> Simple implementation of a Queue with tests in JUnit 4. </h3>
	<dt> A simple implementation in the Java language of a Queue with JUnit test cases. </dt>
	
# Exercises

<h3> Diamond Problem </h3>
	<dt> In object-oriented programming languages, the diamond problem is an ambiguity problem that occurs when two categories B and 	      C inherit from A, and class D inherits from B and C. 
	</dt>
	
<h5> Example: <h5>
	<dt>  		 A <br>
	    		/ \ <br>
	   	       B   C <br>
	    		\ / <br>
	      		 D <br>
	</dt>
	<p><i><dt> "If a method in D calls a method defined in A, By what class inherit, B or C?" </dt></i></p>
	
If you want to know more about the diamond problem: [Diamond Problem](https://es.wikipedia.org/wiki/Problema_del_diamante) 

	
<h3> Singleton (Design Pattern) </h3>
	<dt> Singleton is a standard software design, This pattern guarantees the existence of only one instance of a class, maintaining 	      a global point of access to its object.
	</dt>
	
<h5> Example in Java: </h5>
	private enum Elvis <br>
  	{ <br>
      	       INSTANCIA; <br>
  			<br>
      	       public void cantar(){ ... } <br>
  	} <br>

If you want to know more about Singleton: [Singleton Pattern](https://en.wikipedia.org/wiki/Singleton_pattern)
