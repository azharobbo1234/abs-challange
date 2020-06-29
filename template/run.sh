#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
java -jar "${DIR}/{{product_name.lower()|safe}}_{{instance_name.lower()|safe}}.jar"
