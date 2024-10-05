import 'package:flutter/material.dart';

class Resposta extends StatelessWidget {
  final String texto;
  final void Function() onSelection;

  Resposta(this.texto, this.onSelection);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      child: ElevatedButton(
          child: Text(texto),
          onPressed: onSelection,
          style: ButtonStyle(
            backgroundColor:
                MaterialStateProperty.all(Color.fromRGBO(32, 147, 241, 1)),
            textStyle: MaterialStateProperty.all(
                TextStyle(color: Color.fromRGBO(240, 238, 238, 1))),
          )),
    );
  }
}
