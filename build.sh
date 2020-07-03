#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
ant -buildfile "${DIR}/build.xml" -Dabsproduct=TransferAll abs.deploy