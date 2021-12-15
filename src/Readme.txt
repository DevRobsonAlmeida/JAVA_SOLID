Principios:
Coesão 
 - "Classes não coesas tendem a crescer indefinidamente, o que as torna difíceis de manter"

Encapsulamento
 - "Classes não encapsuladas permitem violação de regras de negócio, além de aumentarem o acoplamento"

	Erros comuns no encapsulamento é atribuir get's e set's para dados deverá ser manipulado diretamente. 
	Ex: salario, atributo a qual deve ser ter um retorno, mas a forma de atribuir valor não verá ser direta para uma segurança no dados.

Acoplamento
- "Classes acopladas causam frafilidade no código da aplicação, o que dificulta sua manutenção"

SOLID:
Single Responsibility Principle
  Just Because You Can, Doens't Mean You Should

Principio:
  - Uma classe deveria ter apenas um único motivo para mudar
			 -- Robert (Uncle Bob) Martin


Open Closed Principle
 Open Chest  Surgery Is Not Needed When Putting On A Coat

Principio:
- "Entidades de software(Classes, módulos, funções, etc.) devem estar abertas para extensão, porém fechadas para modificações"
			 -- Berthand Meyer


Liskov Substitution Principle
 - If It Looks Like A Duke, Quancks Like A Duck, But Needs Batteries - You Probably Have The Wrong Abstraction

Principio:
 - "Se q(x) é um propriedade demostrável dos objetos x de tipo T, 
	então q(y) deve ser verdadeiro para objetos y 
	de tipo S, onde S é um subtipo de T."
			-- Barbara Liskov


Interface Segregation Principle
 - You Want Me To Plug This In, Where?
 
Principios: 
- "Uma classe não deveria ser forçada a depende de métodos que não utilizará."
			-- Robert (Uncle Bob) Martin

Dependency Inversion Principle
 - Would You Solder A Lamp Directly To The Electrical Wiring In A Wall?

Principio:
- "Abstrações não deve depender de implementações . Implementaçõe devem depende de abstrações."
			-- Robert (Uncle Bob) Matin