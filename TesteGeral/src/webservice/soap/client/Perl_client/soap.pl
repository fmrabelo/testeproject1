#!/usr/bin/perl -w
#use SOAP::Lite +trace => 'all';
use 5.010;
use strict;
use warnings;
use SOAP::Lite;
$SOAP::Constants::PREFIX_ENV = 'soapenv';
$SOAP::Constants::PREFIX_ENC = "SOAP-ENC";

#my $var = {'a' => "test"};
#my $result = $soap -> add($var);

my $url = 'http://127.0.0.1:9876/webservice.soap?wsdl';

my $service = SOAP::Lite->service($url)->soapversion('1.1');
print "\nCurrent time is: ", $service->getTimeAsString();
print "\nElapsed milliseconds from the epoch: ", $service->getTimeAsElapsed();