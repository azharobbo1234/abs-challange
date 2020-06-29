#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
ant -buildfile "${DIR}/build.xml" -Dabsproduct={{product_name|safe}} abs.deploy
