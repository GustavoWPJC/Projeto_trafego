# 🚦 Simulador de Mobilidade Urbana para Controle de Semáforos

Trabalho final da disciplina de **Estruturas de Dados**, este projeto propõe o desenvolvimento de um simulador para a gestão do tráfego urbano, com foco no **controle inteligente de semáforos**.

## 📘 Resumo

A rede urbana é modelada como um **grafo**, onde os nós representam interseções e as arestas representam ruas. O sistema simula a geração e o deslocamento de veículos, e por meio de heurísticas de controle, otimiza os ciclos dos semáforos visando:

- Reduzir o tempo de espera dos veículos
- Otimizar o consumo de energia

Ao final da simulação, o sistema apresenta estatísticas como:

- Tempo médio de viagem
- Tempo médio de espera
- Índices de congestionamento

## 🎯 Objetivos

- Modelar a rede urbana como um grafo com interseções e ruas
- Simular a geração e o deslocamento de veículos, com rotas eficientes
- Implementar um sistema de controle de semáforos com heurísticas adaptativas
- Utilizar estruturas de dados próprias (filas, listas, grafos)
- Apresentar estatísticas da simulação

## ⚙️ Requisitos Funcionais

1. Representar a cidade como um grafo, com nós (interseções) e arestas (ruas).
2. Gerar veículos aleatórios com origens e destinos, utilizando o algoritmo de Dijkstra.
3. Simular o controle de semáforos com três modos:
   - Modelo 1: Ciclo fixo
   - Modelo 2: Otimização do tempo de espera (filas de veículos)
   - Modelo 3: Otimização do consumo de energia
4. Permitir configuração de:
   - Parâmetros de geração de tráfego
   - Ciclos dos semáforos
   - Atributos das ruas
   - Horários de pico
5. Registrar dados da simulação: tempo de viagem, espera, volume de veículos e consumo energético.

## 📋 Requisitos Não Funcionais

- Utilizar eficientemente estruturas de dados (grafos, filas, listas)
- Implementação modular e bem documentada
- Interface com logs e, se possível, visualização gráfica da rede

## 🛠 Parâmetros de Configuração

- Número de interseções (nós) e ruas (arestas)
- Comprimento, capacidade e tempo de travessia das ruas
- Taxa de geração de veículos
- Tempos dos semáforos (verde, amarelo, vermelho)
- Modo de operação dos semáforos (fixo ou adaptativo)
- Dados relacionados ao consumo de energia

## 📦 Entregáveis

- Código-fonte em Java (implementação completa e comentada)
- Documento técnico com modelagem, estruturas e algoritmos
- Apresentação (slides explicativos em widescreen)
- Relatório com análises estatísticas (gráficos e tabelas)
- Demonstração prática (vídeo ou capturas de tela)

## 📈 Critérios de Avaliação

- Correção dos requisitos funcionais
- Eficiência na utilização das estruturas de dados
- Clareza do código-fonte e da documentação
- Criatividade nas heurísticas de controle dos semáforos
- Adaptabilidade do sistema a diferentes configurações

## ✅ Conclusão

O projeto integra estruturas de dados, algoritmos de grafos e simulação para criar uma ferramenta de análise do tráfego urbano. A modelagem da cidade como grafo e o uso de heurísticas para controle dos semáforos buscam contribuir para a **melhoria da mobilidade** e a **eficiência energética** no ambiente urbano.
