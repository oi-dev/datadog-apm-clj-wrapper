# datadog-apm-clj-wrapper

This project gives a way to use the datadog-apm tracing in clojure.

## Installation

Add `[datadog-apm-clj-wrapper "0.1.1"]` to your project.clj.

## Before Usage
Make sure to add `-javaagent:/path/to/dd-java-agent.jar` to your java -jar process,
or use it as `:jvm-opts` to run locally

Datadog agent needs to be installed and configured with proper api key and apm enabled on the machine.
For reference, follow https://docs.datadoghq.com/tracing/setup/java/

## Usage

Set the service-name using environment variable `SERVICE_NAME`

To use it, all we have to do is call  
```(datadog-apm-clj-wrapper.core/instrument operation-name operation-as-a-fn)```

### Example

```(datadog-apm-clj-wrapper.core/instrument "sum-two-numbers" #(+ 4 1)) ```
