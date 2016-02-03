FROM centos:7
MAINTAINER uryyyyyyy <koki305@gmail.com>
RUN yum update -y
RUN yum clean all
RUN yum install tcl gcc wget make vim net-tools -y

RUN wget -c -O /tmp/jdk-8u65-linux-x64.rpm --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u65-b17/jdk-8u65-linux-x64.rpm
RUN yum -y localinstall /tmp/jdk-8u65-linux-x64.rpm

# cassandra
RUN wget http://ftp.jaist.ac.jp/pub/apache/cassandra/3.2.1/apache-cassandra-3.2.1-bin.tar.gz
RUN tar zxvf apache-cassandra-3.2.1-bin.tar.gz

RUN adduser cassandra
RUN chown -R cassandra:cassandra apache-cassandra-3.2.1/
# USER cassandra
# RUN apache-cassandra-3.2.1/bin/cassandra

CMD [ "/bin/bash" ]
