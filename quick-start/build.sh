#!/usr/bin/env bash
echo "Compiling : src/quick-start/price.per"
fglform -M price.per
echo "Compiling : src/quick-start/edit_price.per"
fglform -M edit_price.per
echo "Compiling : src/quick-start/price.4gl"
fglcomp -M price.4gl

echo "Generating quick-start guide Genero archive"
fglgar gar -o ggc-quick-start.gar
