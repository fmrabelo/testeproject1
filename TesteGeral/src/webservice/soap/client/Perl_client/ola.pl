#!/usr/bin/perl -w
use 5.010;
use strict;
use warnings;

say ">> say Ola Perl...";

say "Qual eh o seu nome? ";
my $nome = <STDIN>;
chomp $nome;
say "Ola $nome, como voce esta?";
