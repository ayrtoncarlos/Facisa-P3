# Facisa-P3

Repository of exercises and projects of graduation period 2017.2.

Discipline: Programming III

Teacher: [Daniel Abella](https://github.com/daniel-abella)

College: University Center [UNIFACISA](http://www.cesed.br/portal/)

Course: Bachelor of Information Systems


# Projects in JAVA

<h2> ♣ Singleton </h2>
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

<h2> ♣ Visibility of classes and methods </h2>
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

# Algorithms

<h2> ♠ Sorting Algorithms: </h2>

<ul>
<li> Bubble Sort: </li>
	<dt> Method of simple implementation of the ordering algorithm Bubble Sort with JUnit 4 tests. </dt>
</ul>

<h2> ♠ Algorithms for binary trees: </h2>

<ul>
<li> Level Order Tree Traversal with Queue. </li>
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
	
</ul>

<h2> ♠ Algorithms of data structures: </h2>

<ul>
<li> Deque with linked list: </li>
	<dt> A simple implementation in the Java language of a Deque with linked list and JUnit test cases. </dt>
	
<li> Deque: </li>
	<dt> A simple implementation in the Java language of a Deque with JUnit test cases. </dt>
	
<li> Stack: </li>
	<dt> A simple implementation in the Java language of a Stack with JUnit test cases. </dt>

<li> Queue: </li>
	<dt> A simple implementation in the Java language of a Queue with JUnit test cases. </dt>
</ul>

# Exercises

<h2> ♦ Diamond Problem </h2>
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

	
<h2> ♦ Singleton (Design Pattern) </h2>
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
