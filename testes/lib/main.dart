import 'package:flutter/material.dart';
import 'package:testes/questionario.dart';
import 'package:testes/resultado.dart';

void main() {
  runApp(new PerguntaApp());
}

class PerguntaApp extends StatefulWidget {
  @override
  State<PerguntaApp> createState() => _PerguntaAppState();
}

class _PerguntaAppState extends State<PerguntaApp> {
  var _perguntaSelecionada = 0;

  final _perguntas = const [
    {
      'texto': 'Qual a sua cor favorita?',
      'respostas': [
        {'text': 'Vermelho', 'nota': 10},
        {'text': 'Azul', 'nota': 5},
        {'text': 'Amarelo', 'nota': 3},
        {'text': 'Outro', 'nota': 1},
      ],
    },
    {
      'texto': 'Qual o seu animal favorito?',
      'respostas': [
        {'text': 'Leão', 'nota': 10},
        {'text': 'Cachorro', 'nota': 5},
        {'text': 'Papagaio', 'nota': 3},
        {'text': 'Outro', 'nota': 1},
      ],
    },
  ];

  void _responder() {
    if (temPerguntaSelecionada) {
      setState(() {
        _perguntaSelecionada++;
      });
    }
  }

  bool get temPerguntaSelecionada {
    return _perguntaSelecionada < _perguntas.length;
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
            appBar: AppBar(
              title: Text('Perguntas'),
            ),
            body: temPerguntaSelecionada
                ? Questionario(
                    perguntas: _perguntas,
                    perguntaSelecionada: _perguntaSelecionada,
                    responder: _responder,
                  )
                : Resultado()));
  }
}
