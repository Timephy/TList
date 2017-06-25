#!/bin/bash

source javaproj.txt

javadoc -private -d doc/ -sourcepath src/ -subpackages .
