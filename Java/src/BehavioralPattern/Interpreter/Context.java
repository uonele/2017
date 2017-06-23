package BehavioralPattern.Interpreter;

import java.util.Stack;

/**
 * Created by root on 16-12-23.
 */
public class Context {
    private Context context;

    private AbstractNode abstractNode;

    public void parse(String string){
        AbstractNode a = null, b = null;
        Stack stack = new Stack();
        String[] strings = string.split(" ");
        for (int i =0; i < strings.length; i++){
            if (strings[i].equalsIgnoreCase("and")){
                a = (AbstractNode)stack.pop();
                int val = Integer.parseInt(strings[++i]);
                b = new NodeValue(val);
                stack.push(new AndExpression(a,b));
            }else if(strings[i].equalsIgnoreCase("or")){
                a = (AbstractNode)stack.pop();
                int val = Integer.parseInt(strings[++i]);
                b = new NodeValue(val);
                stack.push(new OrExpression(a,b));
            }else {
                stack.push(new NodeValue(Integer.parseInt(strings[i])));
            }
        }
        this.abstractNode = (AbstractNode)stack.pop();
    }
    public int execute(){
        return abstractNode.interpret();
    }
}
