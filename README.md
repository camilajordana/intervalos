# Pratica_TDD

Prática 2 da disciplina de Teste de Software 

Alunas:
- Camila Jordana R. Teixeira
- Tatiana Dantas
- Helora Dana

Problema: http://dojopuzzles.com/problemas/exibe/intervalos/

## Plano de Teste

### Classes de equivalência
| Variáveis de Entrada | Condições | Classes Válidas | Classes Inválidas | Nº
| --- | --- | --- | --- | --- |
| lista[] (int) | Tamanho da lista tem que ser maior que 0 | lista.size > 0 |  | 1 |
|  |  |  | lista.size = 0 | 2 |

### Casos de teste
| Classes | Entrada | Saída esperada | 
| --- | --- | --- | 
| 1 | [1,2,3,6,7,8,9,22] | [1,2,3], [6,7,8,9], [22] |
| 2 | [] | [] |

