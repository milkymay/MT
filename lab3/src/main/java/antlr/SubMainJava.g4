grammar SubMainJava;
s : package_info class_info PSVM LFB b RFB RFB;

package_info : PACKAGE TESTS SEM;
class_info : CLASS TEST LFB;

b : args ops souts;

args : type name ns z SEM;
ns : | COMA name ns;
z : | SEM type name ns z;

ops : | (eq | as | if_block | while_block) ops;
eq : name EQ expr sign expr SEM;
as : name EQ expr SEM;
expr : name | num;

if_block : IF LPAREN cond RPAREN LFB ops RFB |  IF LPAREN cond RPAREN LFB ops RFB ELSE LFB ops RFB;
while_block : WHILE LPAREN cond RPAREN LFB ops RFB;

souts : SOUT name RPAREN_SEM q;
q : | SOUT name RPAREN_SEM q;

cond: name comp num | num comp name | name comp name;

type : T;
name : N;
num : NUM;
comp: COMP;
sign: SIGN;

WS : [ \t\r\n]+ -> skip ;
T : 'int';
LPAREN: '(';
RPAREN: ')';
RPAREN_SEM : ');';
IF : 'if';
WHILE : 'while';
ELSE : 'else';
PSVM : 'public static void main(String[] args)';
PACKAGE : 'package';
CLASS :  'public class';
LFB : '{';
RFB : '}';
SEM : ';';
COMP : '>' | '<' | '>=' | '<=' | '==' | '!=';
EQ : '=';
COMA : ',';
SIGN : '+' | '-' | '*';
SOUT : 'System.out.println(';
TESTS : 'tests';
TEST : 'test'[0-9]+;
NUM : [1-9]+[0-9]*;
N : [a-zA-Z_]+[0-9a-zA-Z_]*;
