// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/NewFile.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class NewFile {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=3;
      Object Q=$fix(GCollections.asSet("A","B"));
      $line=4;
      Object \u03A3=$fix(GCollections.asSet('c','a'));
      $line=5;
      Object q_0=$fix("A");
      $line=6;
      Object F=$fix(GCollections.asSet("B"));
      $line=7;
      Object M=$fix(new Object[]{new Object[]{"A",'a',"A"},new Object[]{"A",'c',"B"}});
      $line=8;
      Object N=$fix($invokeConstructor(GNondeterministicAutomaton.class,new Object[]{Q,\u03A3,q_0,F,M}));
      $line=9;
      $invokeMethod("show",$invokeConstructor(GAutomataFrame.class,new Object[]{}),new Object[]{N});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,NewFile.class,"main",$line);
    }
  }
}
